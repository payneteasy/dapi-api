package com.payneteasy.dapi.acknowledge.cardref.request;

import com.payneteasy.dapi.acknowledge.general.InConsumer;
import com.payneteasy.dapi.acknowledge.general.InDevice;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class SendSaleCardReferenceRequest {
    private InConsumer consumer;
    private CardReferenceSession session;
    private CardNonSensitiveDataAndReference sourceCard;

    public static SendSaleCardReferenceRequest.Builder builder() {
        return new SendSaleCardReferenceRequest.Builder();
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

    public static class Builder {
        private String serialNumber;
        private String accessToken;
        private String token;
        private Integer sourceBin;
        private Long sourceServerCardId;
        private Long sourceUniqueReferenceCardId;

        private Builder() {
        }

        public SendSaleCardReferenceRequest.Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public SendSaleCardReferenceRequest.Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public SendSaleCardReferenceRequest.Builder token(String token) {
            this.token = token;
            return this;
        }

        public SendSaleCardReferenceRequest.Builder sourceBin(Integer sourceBin) {
            this.sourceBin = sourceBin;
            return this;
        }

        public SendSaleCardReferenceRequest.Builder sourceServerCardId(Long sourceServerCardId) {
            this.sourceServerCardId = sourceServerCardId;
            return this;
        }

        public SendSaleCardReferenceRequest.Builder sourceUniqueReferenceCardId(Long sourceUniqueReferenceCardId) {
            this.sourceUniqueReferenceCardId = sourceUniqueReferenceCardId;
            return this;
        }

        public SendSaleCardReferenceRequest build() {
            SendSaleCardReferenceRequest request = new SendSaleCardReferenceRequest();
            request.setConsumer(new InConsumer(new InDevice(serialNumber)));
            request.setSession(new CardReferenceSession(accessToken, token));
            if (this.sourceBin != null) {
                final CardNonSensitiveDataAndReference sourceCard = createCard(this.sourceBin, this.sourceServerCardId,
                        this.sourceUniqueReferenceCardId,
                        "sourceUniqueReferenceCardId cannot be null");
                request.setSourceCard(sourceCard);
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
