package kotlinx.coroutines;

import L7.AbstractC0160s;
import Z.g;
import d6.InterfaceC0622h;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/DispatchException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "kotlinx-coroutines-core"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DispatchException extends Exception {

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f12156d;

    public DispatchException(Throwable th, AbstractC0160s abstractC0160s, InterfaceC0622h interfaceC0622h) {
        super("Coroutine dispatcher " + abstractC0160s + " threw an exception, context = " + interfaceC0622h, th);
        this.f12156d = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f12156d;
    }
}
