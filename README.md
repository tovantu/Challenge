# Required: 
* JDK 14
* Maven 3.6.3
# How to use this framework
* Parallel: Current is 2 threadcounts, can change in the POM file.
* Run test: (mvn -Dtest=Registration test) or (mvn -Dtest=RegistrationDataDriven test).
* PageObject: contain page element: Declare object with new WebElementCustom(By Object) and that element should implement interface like ClickInterface or InputInterface.
* TestClass: where to write test cases.
* TestData: hold the test data.

