package br.fadep.casa.model.exeptions;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true)
public class VersionException extends IllegalArgumentException {

    public VersionException() {

    }

    public VersionException(String msg) {
        super(msg);
    }

    public VersionException(String msg, Throwable throwable) {
        super(msg, throwable);
    }
}
