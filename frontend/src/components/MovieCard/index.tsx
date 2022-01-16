import { Link } from "react-router-dom";
import { Movie } from "../../types/movies";
import MovieScore from "../MovieScore";

type Props = {
    movies : Movie;
}

function MovieCard( {movies} : Props){
   
    return(
        <div>
    <img className="dsmovie-movie-card-image" src={movies.image} alt={movies.title} />
    <div className="dsmovie-card-bottom-container">
        <h3>{movies.title}</h3>
        <MovieScore count={movies.count} score={movies.score} />
        <Link to={`../../Form/${movies.id}`}>
        <div className="btn btn-primary dsmovie-btn">Avaliar</div>
        </Link>
        
        
    </div>
</div>
    );
}

export default MovieCard;
