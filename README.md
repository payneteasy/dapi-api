# dapi-api
DAPI classes for merchant acknowlege and card-ref notification.
Classes in 'check' are use for all merchant acknowlege requests, classes in 'cardref' are use for sending IDs for mapping information to merchant.
Non-abstract classes that ended with '*Request' and '*Response' endings should be used as API with structure for HTTP requests and responses.
For different operations (sale/transfer/verification) there are matched request/response classes with similar names.