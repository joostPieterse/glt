Script circles runs as
	while not heading south do
		turnLeft
	end
	
	while not wall ahead do
		step
	end
	
	repeat 10 times
		turnLeft
		repeat 2 times
			if not wall ahead do 
				step
			end
		end

		buildWall at row: 5 col: 5
		dropMark at row: 4 col: 4 
	end
end
