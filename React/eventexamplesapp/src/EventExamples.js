import React from "react";
import CurrencyConvertor from "./CurrencyConvertor";

class EventExamples extends React.Component {

    constructor(props) {
        super(props);

        this.state = {
            count: 0,
            message: ""
        };
    }

    increment = () => {
        this.setState({
            count: this.state.count + 1
        });
    };

    decrement = () => {
        this.setState({
            count: this.state.count - 1
        });
    };

    sayHello = () => {
        this.setState({
            message: "Hello! Member!"
        });
    };

    handleIncrement = () => {
        this.increment();
        this.sayHello();
    };

    sayWelcome = (msg) => {
        alert(msg);
    };

    syntheticEvent = () => {
        alert("I was clicked");
    };

    render() {

        return (
            <div style={{ margin: "20px" }}>

                <h2>Counter : {this.state.count}</h2>

                <button onClick={this.handleIncrement}>
                    Increment
                </button>

                <button onClick={this.decrement}>
                    Decrement
                </button>

                <br /><br />

                <h3>{this.state.message}</h3>

                <button
                    onClick={() => this.sayWelcome("Welcome")}
                >
                    Say Welcome
                </button>

                <br /><br />

                <button onClick={this.syntheticEvent}>
                    OnPress
                </button>

                <br /><br />

                <CurrencyConvertor />

            </div>
        );
    }
}

export default EventExamples;