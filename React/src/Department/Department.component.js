import React, { Component } from 'react';

import { AddDepartmentComponent } from './AddDepartment.component';
import { DepartmentListComponent } from './DepartmentList.component';

export class DepartmentComponent extends Component {
  render() {
    return(  
      <div>
        <h3>Department Component</h3>
        <AddDepartmentComponent  onAdd={this.props.onDeptAddHandler} />
        <DepartmentListComponent departments={this.props.departments}/>
      </div>
    ); 
  }
} 