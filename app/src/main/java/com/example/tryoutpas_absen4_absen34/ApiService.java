package com.example.tryoutpas_absen4_absen34;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("search_all_teams.php")
    Call<TeamResponse> getTeams(@Query("l") String league);

    @GET("search_all_teams.php")
    Call<TeamResponse> getTeamsByLeague(@Query("l") String league);

    @GET("search_all_teams.php")
    Call<TeamResponse> getTeamsSpanish(@Query("s") String league, @Query("c") String soccer);
}
