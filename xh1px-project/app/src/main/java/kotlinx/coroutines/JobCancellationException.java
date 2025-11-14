package kotlinx.coroutines;

import L7.d0;
import L7.g0;
import Z.g;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import o6.j;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "kotlinx-coroutines-core"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JobCancellationException extends CancellationException {

    /* renamed from: d, reason: collision with root package name */
    public final transient d0 f12157d;

    public JobCancellationException(String str, Throwable th, d0 d0Var) {
        super(str);
        this.f12157d = d0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (j.a(jobCancellationException.getMessage(), getMessage())) {
                    Object obj2 = jobCancellationException.f12157d;
                    if (obj2 == null) {
                        obj2 = g0.f3215e;
                    }
                    Object obj3 = this.f12157d;
                    if (obj3 == null) {
                        obj3 = g0.f3215e;
                    }
                    if (!j.a(obj2, obj3) || !j.a(jobCancellationException.getCause(), getCause())) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int i4;
        String message = getMessage();
        j.b(message);
        int hashCode = message.hashCode() * 31;
        Object obj = this.f12157d;
        if (obj == null) {
            obj = g0.f3215e;
        }
        int i8 = 0;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (hashCode + i4) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i8 = cause.hashCode();
        }
        return i9 + i8;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.f12157d;
        if (obj == null) {
            obj = g0.f3215e;
        }
        sb.append(obj);
        return sb.toString();
    }
}
