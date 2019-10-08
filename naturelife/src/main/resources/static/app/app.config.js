
angular.module("naturLife")
   .config(function($routeProvider, $locationProvider) {

    $locationProvider.html5Mode({
        enabled:true
    });

    $routeProvider
    .when("/", {
        template : '<products-list></products-list>'
    })
    .when("/contact", {
        template : "<h1>CONTACT COMPONENT</h1>"
    })
    .when("/about", {
        template : "<h1>ABOUT COMPONENT</h1>"
    })
    .otherwise({
        template : "<h1>NOT COMPONENT MAP FOR THAT URI</h1>"
    });;
});