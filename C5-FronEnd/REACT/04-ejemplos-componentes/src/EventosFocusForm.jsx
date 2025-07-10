function FocusExample() {
  return (
    <div
      tabIndex={1}
      onFocus={(e) => {
        if (e.currentTarget === e.target) {
          console.log('focused parent');
        } else {
          console.log('focused child', e.target.name);
        }
        if (!e.currentTarget.contains(e.relatedTarget)) {
          // No se activa al cambiar el enfoque entre los hijos
          console.log('focus entered parent');
        }
      }}
      onBlur={(e) => {
        if (e.currentTarget === e.target) {
          console.log('unfocused parent');
        } else {
          console.log('unfocused child', e.target.name);
        }
        if (!e.currentTarget.contains(e.relatedTarget)) {
          // No se activa al cambiar el enfoque entre los hijos
          console.log('focus left parent');
        }
      }}
    >
      <label>
        Nombre:
        <input name="firstName" />
      </label>
      <label>
        Apellido:
        <input name="lastName" />
      </label>
    </div>
  );
}

export default FocusExample;