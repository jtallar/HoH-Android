package ar.edu.itba.hci.hoh.elements;

import ar.edu.itba.hci.hoh.api.Error;

public class Result<T> {
    private final T result;
    private Error error;

    public Result(T result) {
        this.result = result;
    }

    public Result(T result, Error error) {
        this(result);
        this.error = error;
    }

    public Boolean ok() {
        return this.error == null;
    }

    public T getResult() {
        return this.result;
    }

    public Error getError() {
        return this.error;
    }
}