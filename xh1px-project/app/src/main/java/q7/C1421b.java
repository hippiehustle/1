package q7;

import C6.InterfaceC0001b;
import F6.AbstractC0055o;
import w7.AbstractC1759v;

/* renamed from: q7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1421b extends D6.b {

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0055o f14216f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1421b(InterfaceC0001b interfaceC0001b, AbstractC1759v abstractC1759v) {
        super(abstractC1759v);
        if (abstractC1759v != null) {
            this.f14216f = (AbstractC0055o) interfaceC0001b;
            return;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
    }

    @Override // D6.b
    public final String toString() {
        return b() + ": Ext {" + this.f14216f + "}";
    }
}
