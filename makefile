# Define variables
CC = gcc
CFLAGS = -Wall -g   # Wall enables all compiler warnings, -g includes debug info
TARGET = hashTable  # Name of the final executable

# Source files
SOURCES = hash.c

# Object files
OBJECTS = $(SOURCES:.c=.o)

# Default rule: Build the target executable
all: $(TARGET)

# Rule to link object files into the final executable
$(TARGET): $(OBJECTS)
	$(CC) $(CFLAGS) $(OBJECTS) -o $(TARGET)

# Rule to compile .c files into .o files
%.o: %.c
	$(CC) $(CFLAGS) -c $< -o $@

# Phony target to clean up build artifacts
clean:
	rm -f $(TARGET) $(OBJECTS)

# Phony target for rebuilding the project from scratch
rebuild: clean all

# Declare phony targets
.PHONY: all clean rebuild
