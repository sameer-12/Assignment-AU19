
function employee()
{
this.name = prompt("input name:"+this.name);
this.age = prompt("input age:"+this.age);
this.id = prompt("ïnput empid:"+this.age);
}

//adding property using prototype in the employee function (parent)
employee.prototype.department;

// adding property display in employee
employee.prototype.display()= function()
{
	console.log(this.name);
    console.log(this.age);
    console.log(this.id);
}
// creating object 1: technical
var technical= new employee();
	technical.name="sameer";
	technical.age="22";
	technical.id="6789";
	
	 console.log("technical_name:"+manager.name);
   console.log("technical_age:"+manager.age);
   console.log("technical_id:"+manager.id);
	

// object 2: manager 


   var manager = new employee();
   manager.name="jacky";
   manager.age="32";
   manager.id="7857";
   //using dunter proto for adding propery to the object
   // it add property salary to the object manager
   manager.__proto__.salary="89999";
   
   console.log("manager_name:"+manager.name);
   console.log("manager_age:"+manager.age);
   console.log("manager_id:"+manager.id);
   console.log("manager_salary:"+manager.salary);
   
   // calling function display
   var manager_display = manager.display();
   manager_display.call(manager);
   
   
   //use bind to reuse the method : bind once use ever
   
   var technical_display1 = technical.display();
   var manager_display2 = technical_display1.bind(technical);
   manager_display2();
   
   
   
   
   
   
  
   







