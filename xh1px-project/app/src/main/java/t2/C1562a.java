package t2;

import C6.C0014o;
import C6.EnumC0023y;
import C6.InterfaceC0010k;
import C6.InterfaceC0018t;
import C6.InterfaceC0019u;
import D0.b;
import F6.w;
import android.view.ViewGroup;
import f7.C0725e;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import n1.AbstractC1149a;
import o6.j;
import v7.m;
import w7.AbstractC1759v;
import x0.C1772a;
import x5.f;
import y7.c;

/* renamed from: t2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1562a implements m, b, f, InterfaceC0018t {

    /* renamed from: d, reason: collision with root package name */
    public final Object f15048d;

    public /* synthetic */ C1562a(Object obj) {
        this.f15048d = obj;
    }

    @Override // D0.b
    public D0.a b(String str) {
        j.e(str, "fileName");
        return new C1772a(((E0.b) this.f15048d).J());
    }

    @Override // C6.InterfaceC0018t
    public InterfaceC0019u build() {
        return (c) this.f15048d;
    }

    @Override // C6.InterfaceC0018t
    public InterfaceC0018t f(D6.j jVar) {
        j.e(jVar, "additionalAnnotations");
        return this;
    }

    @Override // C6.InterfaceC0018t
    public InterfaceC0018t h(AbstractC1759v abstractC1759v) {
        j.e(abstractC1759v, "type");
        return this;
    }

    @Override // C6.InterfaceC0018t
    public InterfaceC0018t i(int i4) {
        AbstractC1149a.l("kind", i4);
        return this;
    }

    @Override // C6.InterfaceC0018t
    public InterfaceC0018t k(C0014o c0014o) {
        j.e(c0014o, "visibility");
        return this;
    }

    @Override // C6.InterfaceC0018t
    public InterfaceC0018t l(InterfaceC0010k interfaceC0010k) {
        j.e(interfaceC0010k, "owner");
        return this;
    }

    @Override // v7.m
    public void lock() {
        ((ReentrantLock) this.f15048d).lock();
    }

    @Override // C6.InterfaceC0018t
    public InterfaceC0018t p(C0725e c0725e) {
        j.e(c0725e, "name");
        return this;
    }

    @Override // v7.m
    public void unlock() {
        ((ReentrantLock) this.f15048d).unlock();
    }

    public C1562a(E0.b bVar) {
        j.e(bVar, "openHelper");
        this.f15048d = bVar;
    }

    public C1562a(ViewGroup viewGroup) {
        this.f15048d = viewGroup.getOverlay();
    }

    @Override // C6.InterfaceC0018t
    public InterfaceC0018t a() {
        return this;
    }

    @Override // C6.InterfaceC0018t
    public InterfaceC0018t e() {
        return this;
    }

    @Override // C6.InterfaceC0018t
    public InterfaceC0018t g() {
        return this;
    }

    @Override // C6.InterfaceC0018t
    public InterfaceC0018t j() {
        return this;
    }

    @Override // C6.InterfaceC0018t
    public InterfaceC0018t m() {
        return this;
    }

    @Override // C6.InterfaceC0018t
    public InterfaceC0018t n() {
        return this;
    }

    @Override // C6.InterfaceC0018t
    public InterfaceC0018t q() {
        return this;
    }

    @Override // C6.InterfaceC0018t
    public InterfaceC0018t c(List list) {
        return this;
    }

    @Override // C6.InterfaceC0018t
    public InterfaceC0018t d(EnumC0023y enumC0023y) {
        return this;
    }

    @Override // C6.InterfaceC0018t
    public InterfaceC0018t o(w wVar) {
        return this;
    }
}
