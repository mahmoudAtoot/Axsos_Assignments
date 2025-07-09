import { useState } from 'react'
import HomeComponent from "./components/HomeComponent";
import MainComponent from './components/MainComponent';
import LastComponent from './components/LastComponent';

import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
    <Router>
      <Routes>
        <Route path="/home" element={<HomeComponent />} />
        <Route path="/:value" element={<MainComponent />} />
        <Route path="/:word/:textColor/:bgColor" element={<LastComponent />} />
      </Routes>
    </Router>



    </>
  )
}

export default App
