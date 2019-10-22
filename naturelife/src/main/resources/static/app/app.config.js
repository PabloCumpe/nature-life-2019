
angular.module("naturLife")
   .config(function($routeProvider, $locationProvider) {

    $locationProvider.html5Mode({
        enabled:true
    });

    $routeProvider
    .when("/", {
        template : '<products-list></products-list>'
    })
    .when("/cart", {
        template : "<cart></cart>"
    })
    .when("/checkout", {
        template : "<h1>check out component</h1>"
    })
    .otherwise({
        template : "<h1>NOT COMPONENT MAP FOR THAT URI</h1>"
    });;
});