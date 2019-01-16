
import React,{Component} from 'react';
class ListEmployees extends Component{
    
    render(){
        console.log(this.props.employees)
        
        return(
        <div>
            <h1>Employees</h1>
            <table border="1" cellpading="1">
            {
                this.props.employees &&
                this.props.employees.map((employee,i)=>{
                   return( <tr key={employee.name}>
                        <td>
                            {employee.name}
                        </td>
                        <td>
                            {employee.lname}
                        </td>
                        <td>
                            {employee.age}
                        </td>
                        <td>
                            {employee.designation}
                        </td>
                        <td>
                            {employee.location}
                        </td>
                    </tr>
                    )
                })
            }
            </table>
            
        </div>
        )
    }
}

export default ListEmployees;