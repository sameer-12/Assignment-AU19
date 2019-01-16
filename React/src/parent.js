import React, { Component } from 'react';
import {ChildComponent} from './child.js'
class ParentComponent extends Component {
    name = "sameer";
    state= {
        name:"data"
    };
    constructor()
        {
        super();
        this.handleclick = this.handleclick.bind(this);
    }
    handleclick() {
        let that = this;
        setTimeout(() => {
            that.setState({
                name: "sameer singh"
            });
        }, 200);
    }
    onUpdate = (data) =>
    {
     console.log("data");   
    }
render(){
    return (
        <div>
            <button onClick={this.handleclick}> Change name </button>
            {this.state.name === "Sammer Singh" && <span>hello</span>}
            <ChildComponent name = {this.state.name} onUpdate={this.onUpdate} />
            </div>
    );
    
}
}
export default ParentComponent;
