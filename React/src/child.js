import React, { Component } from 'react';
export const ChildComponent = props => {
    return (
        <div>
            <button onClick={()=>{ props.onUpdate('hello')}} > heelo</button>
        </div >
    );


//return (React.createElement("div", null, "hi"));
};
export default ChildComponent;