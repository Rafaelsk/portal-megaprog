import ListGroup from "./components/ListGroup";
import Alert from "./components/Alert";

function App() {

  let heading = 'German Cities';
  let items = [
    'Berlin',
    'Hamburg',
    'München',
    'Bremen',
    'Frankfurt',
  ];
  const eventHandler = (item: string) => {
    console.log(item);
  };

  // return <div><ListGroup items={items} heading={heading} onSelectItem={eventHandler}/></div>;
  return <div><Alert><span>This is my cool message</span></Alert></div>;
}

export default App;