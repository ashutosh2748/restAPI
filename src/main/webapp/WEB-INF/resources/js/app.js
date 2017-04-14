(function (angular) {
    var myApp = angular.module('restAPI', []);
    myApp.controller('RestAPIController', ['$scope', 'companyService', function ($scope, companyService) {
        $scope.companies = null;
        $scope.getCompany = function () {
            companyService.getAllCompanies().then(function (response) {
                    $scope.companies = response.data;
                    console.log($scope.companies);
                }, function (error) {
                    $scope.status = 'Unable to load users data: ' + error.message;
                }
            );
        }
    }]);
})(window.angular);