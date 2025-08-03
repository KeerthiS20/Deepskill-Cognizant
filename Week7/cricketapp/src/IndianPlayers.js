import React from 'react';

function OddPlayers({ players }) {
  const [first, , third, , fifth] = players;

  return (
    <div>
      <h2>Odd Players</h2>
      <ul>
        <li>First: {first}1</li>
        <li>Third: {third}3</li>
        <li>Fifth: {fifth}5</li>
      </ul>
    </div>
  );
}

const IndianPlayers = () => {
  const allPlayers = ['Sachin', 'Dhoni', 'Virat', 'Rohit', 'Yuvaraj', 'Raina'];
  const evenPlayers = allPlayers.filter((_, index) => index % 2 !== 0);

  const T20Players = ['First Player', 'Second Player', 'Third Player'];
  const RanjiTrophyPlayers = ['Fourth Player', 'Fifth Player', 'Sixth Player'];
  const merged = [...T20Players, ...RanjiTrophyPlayers];

  return (
    <div>
      <OddPlayers players={allPlayers} />

      <h2>Even Players</h2>
      <ul>
        <li>Second: {evenPlayers[0]}2</li>
        <li>Fourth: {evenPlayers[1]}4</li>
        <li>Sixth: {evenPlayers[2]}6</li>
      </ul>

      <h2>List of Indian Players Merged:</h2>
      <ul>
        {merged.map((player, i) => (
          <li key={i}>Mr. {player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
