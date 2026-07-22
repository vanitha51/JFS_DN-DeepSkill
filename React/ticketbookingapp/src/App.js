import React from 'react';
import GuestPage from './GuestPage';
import UserPage from './UserPage';

class App extends React.Component {

  constructor(props) {
    super(props);

    this.state = {
      isLoggedIn: false
    };
  }

  handleLogin = () => {
    this.setState({ isLoggedIn: true });
  };

  handleLogout = () => {
    this.setState({ isLoggedIn: false });
  };

  render() {

    if (this.state.isLoggedIn) {
      return (
        <UserPage onLogout={this.handleLogout} />
      );
    } else {
      return (
        <GuestPage onLogin={this.handleLogin} />
      );
    }
  }
}

export default App;