import React, { Component } from "react";
//import "./EmployeeComponent.css";

import AddEmployee from "./AddEmployee";
import ListEmployees from "./ListEmployee";
import Department from "./department";
class Employee extends Component{
    state= {
        employees:[
            {
                name: "raviteja",
                lname: "V",
                age: 21,
                designation: "intern",
                location: "Mangalore, Karnataka,India, Asia, World, Earth",
                department: "ml"
              },
              {
                name: "Devraj",
                lname: "M",
                age: 21,
                designation: "intern",
                location: "Bangalore,Karnataka,India, Asia, World, Earth",
                department: "hR"
              },
              {
                name: "kumar",
                lname: "santanu",
                age: 26,
                designation: "intern",
                location: "Patna, Bihar,India, Asia, World, Earth",
                department:"dev-ops"
              }
        ]
    };
    onEmployeeAdded = (newEmployeeData)=>{
        console.log("new Data",newEmployeeData)
        let employees=[...this.state.employees];
        employees.push(newEmployeeData)
        this.setState({employees:employees})
    }
    render(){
        return(
            <React.Fragment>
                <AddEmployee onEmpAdd={this.onEmployeeAdded}>
                </AddEmployee>
                <ListEmployees employees={this.state.employees}>
                </ListEmployees>
            </React.Fragment>
        );
    }
}
export default Employee;