// src/App.js
import React, { useState } from 'react';
import ListofPlayers from './ListofPlayers';
import IndianPlayers from './IndianPlayers';

function App() {
  const [flag, setFlag] = useState(true);

  return (
    <div className="App">
      <h1> Cricket App</h1>
      <ListofPlayers />
      <br />

      <IndianPlayers />
      <br />


      
    </div>
  );
}

export default App;
