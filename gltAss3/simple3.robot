Script thirdProgram runs as
	#sample program using building commands
	if mark and not full or heading north do
		if wall ahead do
			buildWall at row: 13 col: 25
		else do
			drop
		end
		repeat 5 times
			step
			while wall ahead do
				dropMark at row: 24 col: 323
			end
		end
	end
end
