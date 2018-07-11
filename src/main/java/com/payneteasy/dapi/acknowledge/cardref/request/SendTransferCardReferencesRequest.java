package com.payneteasy.dapi.acknowledge.cardref.request;

import com.payneteasy.dapi.acknowledge.general.InConsumer;
import com.payneteasy.dapi.acknowledge.general.InDevice;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class SendTransferCardReferencesRequest {
    private InConsumer consumer;
    private CardReferenceSession session;
    private CardNonSensitiveDataAndReference sourceCard;
    private CardNonSensitiveDataAndReference destinationCard;

    public static Builder builder() {
        return new Builder();
    }

    public InConsumer getConsumer() {
        return consumer;
    }

    public void setConsumer(InConsumer consumer) {
        this.consumer = consumer;
    }

    public CardReferenceSession getSession() {
        return session;
    }

    public void setSession(CardReferenceSession session) {
        this.session = session;
    }

    public CardNonSensitiveDataAndReference getSourceCard() {
        return sourceCard;
    }

    public void setSourceCard(
            CardNonSensitiveDataAndReference sourceCard) {
        this.sourceCard = sourceCard;
    }

    public CardNonSensitiveDataAndReference getDestinationCard() {
        return destinationCard;
    }

    public void setDestinationCard(
            CardNonSensitiveDataAndReference destinationCard) {
        this.destinationCard = destinationCard;
    }

    public static class Builder {
        private String serialNumber;
        private String accessToken;
        private String token;
        private Integer sourceBin;
        private Long sourceServerCardId;
        private Long sourceUniqueReferenceCardId;
        private Integer destinationBin;
        private Long destinationServerCardId;
        private Long destinationUniqueReferenceCardId;

        private Builder() {
        }

        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public Builder sourceBin(Integer sourceBin) {
            this.sourceBin = sourceBin;
            return this;
        }

        public Builder sourceServerCardId(Long sourceServerCardId) {
            this.sourceServerCardId = sourceServerCardId;
            return this;
        }

        public Builder sourceUniqueReferenceCardId(Long sourceUniqueReferenceCardId) {
            this.sourceUniqueReferenceCardId = sourceUniqueReferenceCardId;
            return this;
        }

        public Builder destinationBin(Integer destinationBin) {
            this.destinationBin = destinationBin;
            return this;
        }

        public Builder destinationServerCardId(Long destinationServerCardId) {
            this.destinationServerCardId = destinationServerCardId;
            return this;
        }

        public Builder destinationUniqueReferenceCardId(Long destinationUniqueReferenceCardId) {
            this.destinationUniqueReferenceCardId = destinationUniqueReferenceCardId;
            return this;
        }

        public SendTransferCardReferencesRequest build() {
            SendTransferCardReferencesRequest request = new SendTransferCardReferencesRequest();
            request.setConsumer(new InConsumer(new InDevice(serialNumber)));
            request.setSession(new CardReferenceSession(accessToken, token));
            if (this.sourceBin != null) {
                final CardNonSensitiveDataAndReference sourceCard = createCard(this.sourceBin, this.sourceServerCardId,
                        this.sourceUniqueReferenceCardId,
                        "sourceUniqueReferenceCardId cannot be null");
                request.setSourceCard(sourceCard);
            }
            if (this.destinationBin != null) {
                final CardNonSensitiveDataAndReference destinationCard = createCard(this.destinationBin, this.destinationServerCardId,
                        this.destinationUniqueReferenceCardId,
                        "destinationUniqueReferenceCardId cannot be null");
                request.setDestinationCard(destinationCard);
            }
            return request;
        }

        @Nullable
        private CardNonSensitiveDataAndReference createCard(Integer bin, Long serverCardId, Long uniqueReferenceCardId,
                                                            String uniqueReferenceCardIdIsNullErrorMessage) {
            if (serverCardId == null) {
                return null;
            }
            final CardNonSensitiveDataAndReference card = new CardNonSensitiveDataAndReference();
            card.setBin(bin);
            Objects.requireNonNull(uniqueReferenceCardId, uniqueReferenceCardIdIsNullErrorMessage);
            card.setReference(new ServerCardReference(Long.toString(serverCardId),
                    uniqueReferenceCardId));
            return card;
        }
    }
}
