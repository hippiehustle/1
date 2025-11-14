package N7;

import L7.InterfaceC0149g;
import n6.InterfaceC1165d;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final p f3819a = new p(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f3820b = Q7.b.l("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f3821c = Q7.b.l("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final Q7.t f3822d = new Q7.t("BUFFERED", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final Q7.t f3823e = new Q7.t("SHOULD_BUFFER", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final Q7.t f3824f = new Q7.t("S_RESUMING_BY_RCV", 0);

    /* renamed from: g, reason: collision with root package name */
    public static final Q7.t f3825g = new Q7.t("RESUMING_BY_EB", 0);

    /* renamed from: h, reason: collision with root package name */
    public static final Q7.t f3826h = new Q7.t("POISONED", 0);

    /* renamed from: i, reason: collision with root package name */
    public static final Q7.t f3827i = new Q7.t("DONE_RCV", 0);
    public static final Q7.t j = new Q7.t("INTERRUPTED_SEND", 0);
    public static final Q7.t k = new Q7.t("INTERRUPTED_RCV", 0);

    /* renamed from: l, reason: collision with root package name */
    public static final Q7.t f3828l = new Q7.t("CHANNEL_CLOSED", 0);

    /* renamed from: m, reason: collision with root package name */
    public static final Q7.t f3829m = new Q7.t("SUSPEND", 0);

    /* renamed from: n, reason: collision with root package name */
    public static final Q7.t f3830n = new Q7.t("SUSPEND_NO_WAITER", 0);

    /* renamed from: o, reason: collision with root package name */
    public static final Q7.t f3831o = new Q7.t("FAILED", 0);

    /* renamed from: p, reason: collision with root package name */
    public static final Q7.t f3832p = new Q7.t("NO_RECEIVE_RESULT", 0);

    /* renamed from: q, reason: collision with root package name */
    public static final Q7.t f3833q = new Q7.t("CLOSE_HANDLER_CLOSED", 0);

    /* renamed from: r, reason: collision with root package name */
    public static final Q7.t f3834r = new Q7.t("CLOSE_HANDLER_INVOKED", 0);

    /* renamed from: s, reason: collision with root package name */
    public static final Q7.t f3835s = new Q7.t("NO_CLOSE_CAUSE", 0);

    public static final boolean a(InterfaceC0149g interfaceC0149g, Object obj, InterfaceC1165d interfaceC1165d) {
        Q7.t o7 = interfaceC0149g.o(obj, interfaceC1165d);
        if (o7 != null) {
            interfaceC0149g.r(o7);
            return true;
        }
        return false;
    }
}
