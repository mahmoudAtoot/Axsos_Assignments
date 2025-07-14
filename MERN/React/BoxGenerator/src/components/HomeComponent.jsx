import React, { useState } from 'react';
import './HomeComponent.css';

const HomeComponent = () => {
  const [color, setColor] = useState("");
  const [size, setSize] = useState(100);
  const [boxes, setBoxes] = useState([]);

  const handleSubmit = (e) => {
    e.preventDefault();
    if (color.trim()) {
      setBoxes([...boxes, { color: color.trim(), size: parseInt(size) || 100 }]);
      setColor("");
      setSize(100);
    }
  };

  return (
    <div className="container">
      <form onSubmit={handleSubmit}>
        <label>Color: </label>
        <input
          type="text"
          placeholder="your color"
          value={color}
          onChange={(e) => setColor(e.target.value)}
        />
        <br />
        <label>Size (px): </label>
        <input
          type="number"
          min="10"
          value={size}
          onChange={(e) => setSize(e.target.value)}
        />
        <button type="submit">Add</button>
      </form>

      <div className="boxes-container">
        {boxes.map((box, i) => (
          <div
            key={i}
            className="color-box"
            style={{
              backgroundColor: box.color,
              width: `${box.size}px`,
              height: `${box.size}px`
            }}
            title={`${box.color}, ${box.size}px`}
          />
        ))}
      </div>
    </div>
  );
};

export default HomeComponent;