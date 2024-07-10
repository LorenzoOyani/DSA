CC= clang
CFLAGS= -Wall -g
BINS: libraryTest libmycode.so
# Default target
all: $(BINS)

# Object file for my code
libmycode.o: libmycode.c mycode.h
	$(CC) $(CFLAGS) -c libmycode.c

# Shared library for my code
libmycode.so: libmycode.c mycode.h
	$(CC) $(CFLAGS) -fPIC -shared -o $@ libmycode.c -lc

# Executable that depends on libraryTest.c and libmycode.o
libraryTest: libraryTest.c libmycode.o
	$(CC) $(CFLAGS) -o $@ $^

runtime_libraryTest: libraryTest.c
	$(CC) $(CFLAGS) -o $@ $^ -L. -lmycode

# Clean up generated files
clean:
	rm -f *.o $(BINS)
