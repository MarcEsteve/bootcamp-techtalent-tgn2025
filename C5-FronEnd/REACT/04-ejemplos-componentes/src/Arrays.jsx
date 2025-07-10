const products = [
  { title: "Col", isFruit: false, id: 1 },
  { title: "Ajo", isFruit: false, id: 2 },
  { title: "Manzana", isFruit: true, id: 3 },
];

function ShoppingList() {
  const listItems = products.map((product) => (
    <li
      key={product.id}
      style={{
        color: product.isFruit ? "YellowGreen" : "Peru",
      }}
    >
      {product.title}
    </li>
  ));

  return <ul>{listItems}</ul>;
}


export default ShoppingList;
