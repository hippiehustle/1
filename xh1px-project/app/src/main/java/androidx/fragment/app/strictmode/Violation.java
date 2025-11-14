package androidx.fragment.app.strictmode;

import Z.g;
import g0.AbstractComponentCallbacksC0755y;
import kotlin.Metadata;
import o6.j;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/fragment/app/strictmode/Violation;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "fragment_release"}, k = 1, mv = {1, g.BYTES_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Violation extends RuntimeException {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractComponentCallbacksC0755y f8760d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, String str) {
        super(str);
        j.e(abstractComponentCallbacksC0755y, "fragment");
        this.f8760d = abstractComponentCallbacksC0755y;
    }
}
