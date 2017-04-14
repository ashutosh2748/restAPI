(function (angular) {
    var myApp = angular.module('restAPI', []);
    myApp.controller('RestAPIController', ['$scope', 'companyService', function ($scope, companyService) {
        $scope.companies = null;
        $scope.getCompany = function () {
            companyService.getAllCompanies().then(function (response) {
                    $scope.companies = response.data;
                }, function (error) {
                    $scope.status = 'Unable to load users data: ' + error.message;
                }
            );
        };

        $scope.addCompanyData = function (data) {
            companyService.addCompany(angular.toJson(data)).then(function (response) {
                $scope.companyData = response.data;
                console.log($scope.companyData);
            }, function (error) {
                $scope.status = 'Unable to submit users data: ' + error.message;
            });
        }
    }]);
})(window.angular);