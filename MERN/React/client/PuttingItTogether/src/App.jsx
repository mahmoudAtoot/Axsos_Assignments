import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import PersonCard from './components/PersonCard'
function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <PersonCard firstname="Mahmoud" lastname="Atoot" age={26} haircolor="Black" />
      <PersonCard firstname="Jane" lastname="Doe" age={45} haircolor="Black" />
      <PersonCard firstname="John" lastname="Smith" age={88} haircolor="Brown" />
    </>
  )
}

export default App