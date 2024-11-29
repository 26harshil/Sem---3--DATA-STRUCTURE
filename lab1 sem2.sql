--Part – A
--1. Retrieve a unique genre of songs.

  select distinct genre from Songs
--2. Find top 2 albums released before 2010.
   select top 2 Album_id
   from Albums
   where  Release_year<2010
--3. Insert Data into the Songs Table. (1245, ‘Zaroor’, 2.55, ‘Feel good’, 1005)
     insert into Songs values(1245, 'Zaroor', 2.55, 'Feel good', 1005)
--4. Change the Genre of the song ‘Zaroor’ to ‘Happy’

       update Songs
	   set Genre='happy'
	   where Song_title='zaroor'

	   select * from Songs
--5. Delete an Artist ‘Ed Sheeran’

     delete from Artists
	 where Artist_name='Ed Sheeran'

--6. Add a New Column for Rating in Songs Table. [Ratings decimal(3,2)]

     alter table  Songs
	 add  Ratings decimal(3,2)
	 select *from Songs
--7. Retrieve songs whose title starts with 'S'.
       select song_title 
	   from Songs
	   where  Song_title like 's%'
--8. Retrieve all songs whose title contains 'Everybody'.
        select * 
		from  Songs
		where Song_id like '%Everybody%'
--9. Display Artist Name in Uppercase.
    select UPPER(Artist_name) 
	from Artists
--10. Find the Square Root of the Duration of a Song ‘Good Luck’
     select SQRT(Duration) 
	 from Songs
	 where Song_title='Good luck'
           
--11. Find Current Date.

   select GETDATE()
--12. Find the number of albums for each artist.
   
     select  Artists.Artist_name,count(Album_id)
	 from  Albums
	 join Artists
	 on Albums.Artist_id=Artists.Artist_id
	 group by Artists.Artist_name
--13. Retrieve the Album_id which has more than 5 songs in it.
     select Albums.Album_id, COUNT(Albums.Album_id)  AS SONGSMAX
	 from Albums
	 join songs
	 on Albums.Album_id= Songs.Album_id
	 GROUP BY Albums.Album_id 
	 HAVING COUNT(Albums.Album_id) >5
	 


--14. Retrieve all songs from the album 'Album1'. (using Subquery)
        
		select * from songs
		where Album_id=(
		SELECT Album_id FROM Albums
		WHERE Album_title='ALBUM1'
		)
 
--   15. Retrieve all albums name from the artist ‘Aparshakti Khurana’ (using Subquery)

  SELECT Album_title 
  from  Albums
  where Artist_id = (
  select Artist_id from Artists
  where Artist_name='Aparshakti Khurana')
--16. Retrieve all the song titles with its album title.
     select Songs.Song_title  ,Albums.Album_title
	 from Songs
	 join Albums
	 on Songs.Album_id=Albums.Album_id
--17. Find all the songs which are released in 2020.
   select songs.Song_title from Songs
   join Albums
   on Albums.Album_id=Songs.Album_id
   where Albums.Release_year=2020
--18. Create a view called ‘Fav_Songs’ from the songs table having songs with song_id 101-105.
    create view Fav_Songs
	as 
	select * from Songs
	where song_id 
--19. Update a song name to ‘Jannat’ of song having song_id 101 in Fav_Songs view.
--20. Find all artists who have released an album in 2020.
--21. Retrieve all songs by Shreya Ghoshal and order them by duration. 

  
