angular
    .module('productsService')
    .service('productsService', function ($http, $location) {


        var urlBase = $location.protocol() + "://" + $location.host() + ":" + $location.port();

        this.purchaseCart = function (medioPago) {

            var productos = this.getCart().map(function (e) {
                return {
                    idProducto: e.id,
                    cantidad: e.cantidad
                }
            });

            var request = {
                productos: productos,
                idMedioDePago: medioPago
            }

            return $http.post(urlBase + '/purchase', request)
        }

        this.addProductToCart = function (product) {
            var cart = this.getCart();
            cart.push(product);
            this.saveCart(cart);
        }

        this.deleteProductFromCart = function (product) {
            var cart = this.getCart();
            var newCart = cart.filter(function (val) { return val.id != product.id; });
            this.saveCart(newCart);
        }

        this.deleteAllCartProducts = function () {
            window.localStorage.setItem('cart', JSON.stringify([]));
        }

        this.getApiProducts = function (name) {
            if (name) {
                return $http.get(urlBase + '/products?name=' + name);
            } else {
                return $http.get(urlBase + '/products');
            }
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
