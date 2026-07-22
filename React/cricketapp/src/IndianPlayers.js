import React from "react";

function IndianPlayers() {

    const IndianTeam = [
        "Sachin",
        "Dhoni",
        "Virat",
        "Rohit",
        "Jadeja",
        "Raina"
    ];

    const [first, second, third, fourth, fifth, sixth] = IndianTeam;

    const T20Players = [
        "First Player",
        "Second Player",
        "Third Player"
    ];

    const RanjiPlayers = [
        "Fourth Player",
        "Fifth Player",
        "Sixth Player"
    ];

    const mergedPlayers = [...T20Players, ...RanjiPlayers];

    return (
        <div>

            <h2>Odd Players</h2>

            <div>First : {first}</div>
            <div>Third : {third}</div>
            <div>Fifth : {fifth}</div>

            <br />

            <h2>Even Players</h2>

            <div>Second : {second}</div>
            <div>Fourth : {fourth}</div>
            <div>Sixth : {sixth}</div>

            <br />

            <h2>List of Indian Players Merged:</h2>

            {mergedPlayers.map((player, index) => (
                <div key={index}>
                    Mr. {player}
                </div>
            ))}

        </div>
    );
}

export default IndianPlayers;