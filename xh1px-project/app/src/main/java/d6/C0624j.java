package d6;

import Z5.k;
import e6.EnumC0646a;
import f6.InterfaceC0714d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: d6.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624j implements InterfaceC0617c, InterfaceC0714d {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10449e = AtomicReferenceFieldUpdater.newUpdater(C0624j.class, Object.class, "result");

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0617c f10450d;
    private volatile Object result;

    public C0624j(InterfaceC0617c interfaceC0617c) {
        EnumC0646a enumC0646a = EnumC0646a.f10657e;
        this.f10450d = interfaceC0617c;
        this.result = enumC0646a;
    }

    public final Object a() {
        Object obj = this.result;
        EnumC0646a enumC0646a = EnumC0646a.f10657e;
        if (obj == enumC0646a) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10449e;
            EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC0646a, enumC0646a2)) {
                if (atomicReferenceFieldUpdater.get(this) != enumC0646a) {
                    obj = this.result;
                }
            }
            return EnumC0646a.f10656d;
        }
        if (obj == EnumC0646a.f10658f) {
            return EnumC0646a.f10656d;
        }
        if (!(obj instanceof k)) {
            return obj;
        }
        throw ((k) obj).f7487d;
    }

    @Override // f6.InterfaceC0714d
    public final InterfaceC0714d g() {
        InterfaceC0617c interfaceC0617c = this.f10450d;
        if (interfaceC0617c instanceof InterfaceC0714d) {
            return (InterfaceC0714d) interfaceC0617c;
        }
        return null;
    }

    @Override // d6.InterfaceC0617c
    public final InterfaceC0622h h() {
        return this.f10450d.h();
    }

    @Override // d6.InterfaceC0617c
    public final void k(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC0646a enumC0646a = EnumC0646a.f10657e;
            if (obj2 == enumC0646a) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10449e;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC0646a, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != enumC0646a) {
                        break;
                    }
                }
                return;
            }
            EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
            if (obj2 == enumC0646a2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10449e;
                EnumC0646a enumC0646a3 = EnumC0646a.f10658f;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, enumC0646a2, enumC0646a3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != enumC0646a2) {
                        break;
                    }
                }
                this.f10450d.k(obj);
                return;
            }
            throw new IllegalStateException("Already resumed");
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f10450d;
    }
}
