angular.module("loading")
  .directive('loading', function () {
    return {
      restrict: 'E',
      replace: true,
      templateUrl: "/app/directives/loading/loading.directive.html",
      link: function ($scope, element, attr) {

        $scope.$root.$on('show-loading', function (event, data) {
          $(element).show();
        });

        $scope.$on('hide-loading', function (event, data) {
          $(element).hide();
        });

      }
    };
  })