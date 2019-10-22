angular
    .module('productsService')
    .service('productsService', function ($http, $location) {


        var urlBase = $location.protocol() + "://" + $location.host() + ":" + $location.port();

        this.addProductToCart = function (product) {
            var cart = this.getCart();
            cart.push(product);
            this.saveCart(cart);
        }

        this.deleteProductFromCart = function (product) {
            var cart = this.getCart();
            cart.pop(product);
            this.saveCart(cart);
        }

        this.getApiProducts = function () {
            return $http.get(urlBase + '/products');
        }

        this.getCart = function () {
            var cart = window.localStorage.getItem('cart');
            if (!cart) {
                return [];
            } else {
                return JSON.parse(cart);
            }
        }

        this.saveCart = function (cart) {
            if (cart) {
                window.localStorage.setItem('cart', JSON.stringify(cart));
            }
        }



    });
