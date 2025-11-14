package E0;

import java.io.Closeable;

/* loaded from: classes.dex */
public interface b extends Closeable {
    a J();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z8);
}
