import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import './styles.css';

function Navbar(){
    return (
        <header>
        <nav className="container">
            <div className="grmovie-nav-content">
                <h1>GRMovies</h1>
                <a href="https://github.com/GustavoRPaes" target="_blank" rel="noreferrer">
                    <div className="grmovie-contact-container">
                        <GithubIcon/>
                        <p className="grmovie-contact-link">/GustavoRPaes</p>
                    </div>
                </a>
            </div>
        </nav>
    </header>
    );
}

export default Navbar;