angular
    .module('productsService')
    .service('productsService', function ($http, $location) {
        var urlBase = $location.protocol() + "://" + $location.host() + ":" + $location.port();

        this.getProducts = function () {
            return $http.get(urlBase + '/products');
        }



    });
