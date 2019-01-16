import React,{Component} from 'react';
class AddEmployee extends Component{
    data={}
    state = {
        show: false
      };
   
    onClick = () => {
        this.setState({show:true});
    };
    onCancel = () => {
        this.setState({show:false});
    };
    handleChange = event => {
        console.log(event.target.value);
        this.data[event.target.id]=event.target.value;
    }
   
    add =(e) => {
        e.preventDefault();
        console.log("data",this.data)
        this.props.onEmpAdd(this.data);
    }
    render(){
        return(
        <div>
            <button  onClick={this.onClick}>Add Employees</button>
            {
                this.state.show && (
                    <div>
                        <form>
                            Name:<input type="text" id="name" onChange={this.handleChange} />
                            Last Name:<input type="text" id="lname" onChange={this.handleChange}/>
                            Age:<input type="text" id="age" onChange={this.handleChange}/>
                            Designation:<input type="text" id="designation" onChange={this.handleChange}/>
                            Location:<input type="text" id="location" onChange={this.handleChange}/>
                            <button onClick={this.add}>Add</button>
                            <button onClick={this.onCancel}>Cancel</button>
                        </form>
                    </div>
                )
            }
       </div>
    
    );
}
}

export default AddEmployee;