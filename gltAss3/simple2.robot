Script secondProgram runs as
	#sample program using extended commands
	if mark and not full or heading south do
		if wall ahead do
			pick
		else do
			drop
		end
		repeat 5 times
			step
			while wall ahead do
				turnLeft
			end
		end
	end
end

