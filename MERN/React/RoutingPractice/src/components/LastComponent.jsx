import { useParams } from 'react-router-dom';

function LastComponent() {
  const { word, textColor, bgColor } = useParams();
  const isWord = isNaN(+word);

  return (
    <>
      <div
        style={{
          color: textColor,
          backgroundColor: bgColor,
          padding: '1.5rem',
          textAlign: 'center',
          borderRadius: '8px',
          fontSize: '1.8rem',
        }}
      >
        {isWord
          ? `You entered: ${word}`
          : `Expected a word, but got a number: ${word}`}
      </div>
    </>
  );
}
export default LastComponent;c