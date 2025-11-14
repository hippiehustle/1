package W4;

import Z5.y;
import android.content.Context;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import n6.InterfaceC1166e;

/* loaded from: classes.dex */
public final class a extends AbstractC0720j implements InterfaceC1166e {

    /* renamed from: h, reason: collision with root package name */
    public List f6572h;

    /* renamed from: i, reason: collision with root package name */
    public A4.a f6573i;
    public List j;
    public Collection k;

    /* renamed from: l, reason: collision with root package name */
    public Iterator f6574l;

    /* renamed from: m, reason: collision with root package name */
    public Collection f6575m;

    /* renamed from: n, reason: collision with root package name */
    public int f6576n;

    /* renamed from: o, reason: collision with root package name */
    public int f6577o;

    /* renamed from: p, reason: collision with root package name */
    public int f6578p;

    /* renamed from: q, reason: collision with root package name */
    public int f6579q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ List f6580r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ List f6581s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ A4.a f6582t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f6583u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(A4.a aVar, Context context, InterfaceC0617c interfaceC0617c) {
        super(4, interfaceC0617c);
        this.f6582t = aVar;
        this.f6583u = context;
    }

    @Override // n6.InterfaceC1166e
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        a aVar = new a(this.f6582t, this.f6583u, (InterfaceC0617c) obj4);
        aVar.f6580r = (List) obj2;
        aVar.f6581s = (List) obj3;
        return aVar.v(y.f7506a);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:35)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x01b8 -> B:5:0x01bd). Please report as a decompilation issue!!! */
    @Override // f6.AbstractC0711a
    public final java.lang.Object v(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r25v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */
}
