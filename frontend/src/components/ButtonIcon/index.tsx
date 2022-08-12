import './styles.css';

import { useNavigate } from 'react-router-dom';
import { ReactComponent as ArrowIcon } from 'assets/images/arrow.svg';

type ButtonIconProps = {
  text: string;
};

const ButtonIcon = ({ text }: ButtonIconProps) => {
  const navigate = useNavigate();
  function goToProducts() {
    navigate('/products');
  }

  return (
    <div className="btn-container" onClick={goToProducts}>
      <button className="btn btn-primary">
        <span>{text}</span>
      </button>
      <div className="btn-icon-container">
        <ArrowIcon />
      </div>
    </div>
  );
};

export default ButtonIcon;
