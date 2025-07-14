import { useParams } from 'react-router-dom';

function MainComponent() {
    const { value } = useParams();
    const isNumber = !isNaN(value);
    return (
        <div>
            {isNumber ? (
                <h2>You entered the number: {value}</h2>
            ) : (
                <h2>You entered the word: "{value}"</h2>
            )}
        </div>
    );
}
export default MainComponent
