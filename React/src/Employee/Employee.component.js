import React, { Component } from 'react';

import { AddEmployeeComponent } from './AddEmployee.component';
import { EmployeeListComponent } from './EmployeeList.component';

export class EmployeeComponent extends Component {
  
  state = {
    employees : [],
  }

  constructor(){
    super();
    this.onAddHandler = this.onAddHandler.bind(this);
  }

  onAddHandler = (data) => {  
    let employees = [...this.state.employees];
    employees.push(data);
    this.setState({
      employees: employees
    });    
  }

  render() {
    return(  
      <div>
        <h3> Employee component</h3>
  
        <AddEmployeeComponent  onAdd={this.onAddHandler} departments={this.props.departments}/>
        <EmployeeListComponent departments={this.props.departments} employees={this.state.employees}/>
      </div>
    ); 
  }
} 