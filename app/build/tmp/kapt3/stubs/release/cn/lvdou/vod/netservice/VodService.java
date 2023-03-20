package cn.lvdou.vod.netservice;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00bc\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JZ\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u0007H\'J\u001e\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\'JP\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u00072\b\b\u0001\u0010\u0014\u001a\u00020\u00072\b\b\u0001\u0010\u0015\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0016\u001a\u00020\u00072\b\b\u0001\u0010\u0017\u001a\u00020\u0007H\'J\u001e\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00040\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u0007H\'J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00040\u0003H\'J\u001e\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00040\u00032\b\b\u0001\u0010\u001f\u001a\u00020 H\'J\u001e\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010\"\u001a\u00020\u0007H\'J(\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00040\u00032\b\b\u0001\u0010%\u001a\u00020\u00072\b\b\u0001\u0010&\u001a\u00020\u0007H\'J2\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00040\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u00072\b\b\u0001\u0010\u0016\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\'J2\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u00072\b\b\u0001\u0010\u0014\u001a\u00020\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u0007H\'J2\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\b\b\u0001\u0010+\u001a\u00020\u00072\b\b\u0001\u0010,\u001a\u00020\u00072\b\b\u0001\u0010-\u001a\u00020\u0007H\'J(\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010/\u001a\u00020\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u0007H\'J\u001e\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u0007H\'J\u0018\u00101\u001a\b\u0012\u0004\u0012\u000203022\b\b\u0001\u00104\u001a\u00020\u0007H\'J\u0014\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00040\u0003H\'J\u001e\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u00108\u001a\u00020\u0007H\'JP\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010:\u001a\u00020\u00072\b\b\u0001\u0010;\u001a\u00020\u00072\b\b\u0001\u0010<\u001a\u00020\u00072\b\b\u0001\u0010=\u001a\u00020\u00072\b\b\u0003\u0010>\u001a\u00020\u00072\b\b\u0003\u0010\u0013\u001a\u00020\u0007H\'J(\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010:\u001a\u00020\u00072\b\b\u0003\u0010>\u001a\u00020\u0007H\'J\u0014\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0\u00040\u0003H\'J\u0014\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\u00040\u0003H\'J8\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0E0\u00040\u00032\b\b\u0001\u0010G\u001a\u00020\u00072\b\b\u0001\u0010H\u001a\u00020\u00072\b\b\u0001\u0010I\u001a\u00020\u0007H\'J\u001a\u0010J\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0E0\u00040\u0003H\'JB\u0010K\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0E0\u00040\u00032\b\b\u0001\u0010M\u001a\u00020\u00112\b\b\u0001\u0010\u0016\u001a\u00020\u00072\b\b\u0001\u0010G\u001a\u00020\u00112\b\b\u0001\u0010H\u001a\u00020\u0011H\'J<\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00112\b\b\u0001\u0010P\u001a\u00020\u00112\b\b\u0001\u0010Q\u001a\u00020\u00112\b\b\u0001\u0010R\u001a\u00020SH\'J.\u0010T\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0E0\u00040\u00032\b\b\u0001\u0010G\u001a\u00020\u00072\b\b\u0001\u0010H\u001a\u00020\u0007H\'J.\u0010V\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0E0\u00040\u00032\b\b\u0001\u0010G\u001a\u00020\u00072\b\b\u0001\u0010H\u001a\u00020\u0007H\'J\u001e\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0\u00040\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u0007H\'J\u0014\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0\u00040\u0003H\'J\u001e\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0\u00040\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0007H\'J.\u0010^\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020_0E0\u00040\u00032\b\b\u0001\u0010G\u001a\u00020\u00072\b\b\u0001\u0010H\u001a\u00020\u0007H\'J<\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020a0\u00040\u00032\b\b\u0001\u0010b\u001a\u00020\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u00072\b\b\u0001\u0010G\u001a\u00020\u00072\b\b\u0001\u0010H\u001a\u00020\u0007H\'JB\u0010c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0E0\u00040\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u00112\b\b\u0001\u0010e\u001a\u00020\u00072\b\b\u0001\u0010G\u001a\u00020\u00112\b\b\u0001\u0010H\u001a\u00020\u0011H\'JB\u0010f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0E0\u00040\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u00112\b\b\u0001\u0010g\u001a\u00020\u00072\b\b\u0001\u0010G\u001a\u00020\u00112\b\b\u0001\u0010H\u001a\u00020\u0011H\'J\u0014\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020i0\u00040\u0003H\'J\u0014\u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020k0\u00040\u0003H\'J\u0014\u0010l\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020m0\u00040\u0003H\'J\u0014\u0010n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\'J\u0014\u0010o\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020p0\u00040\u0003H\'J(\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00112\b\b\u0001\u0010P\u001a\u00020\u0011H\'J2\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0007H\'J<\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0t0\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u00112\b\b\u0001\u0010G\u001a\u00020\u00112\b\b\u0001\u0010H\u001a\u00020\u00112\b\b\u0001\u0010g\u001a\u00020\u0007H\'J2\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0t0\u00032\b\b\u0001\u0010G\u001a\u00020\u00112\b\b\u0001\u0010H\u001a\u00020\u00112\b\b\u0001\u0010u\u001a\u00020\u0007H\'J\u0014\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020w0\u00040\u0003H\'J<\u0010x\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020y0\u00040\u00032\b\b\u0001\u0010z\u001a\u00020\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u00072\b\b\u0001\u0010{\u001a\u00020\u00072\b\b\u0001\u0010|\u001a\u00020\u0007H\'J\u0014\u0010}\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020~0\u00040\u0003H\'J)\u0010\u007f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\t\b\u0001\u0010\u0080\u0001\u001a\u00020\u00072\b\b\u0001\u0010;\u001a\u00020\u0007H\'J\u0015\u0010\u0081\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\'J*\u0010\u0082\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0083\u00010\u00040\u00032\b\b\u0001\u0010G\u001a\u00020\u00072\b\b\u0001\u0010H\u001a\u00020\u0007H\'J\u0016\u0010\u0084\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0085\u00010\u00040\u0003H\'J!\u0010\u0086\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0087\u00010\u00040\u00032\t\b\u0001\u0010\u0088\u0001\u001a\u00020\u0007H\'J\u0016\u0010\u0089\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008a\u00010\u00040\u0003H\'J!\u0010\u008b\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008c\u00010\u00040\u00032\t\b\u0001\u0010\u008d\u0001\u001a\u00020\u0007H\'J4\u0010\u008e\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\t\b\u0001\u0010\u0080\u0001\u001a\u00020\u00072\b\b\u0001\u0010;\u001a\u00020\u00072\b\b\u0001\u0010<\u001a\u00020\u0007H\'J=\u0010\u008f\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010:\u001a\u00020\u00072\b\b\u0001\u0010;\u001a\u00020\u00072\b\b\u0001\u0010=\u001a\u00020\u00072\b\b\u0003\u0010>\u001a\u00020\u0007H\'JI\u0010\u0090\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010+\u001a\u00020\u00072\b\b\u0001\u0010,\u001a\u00020\u00072\b\b\u0001\u0010-\u001a\u00020\u00072\t\b\u0001\u0010\u0091\u0001\u001a\u00020\u00072\t\b\u0001\u0010\u0092\u0001\u001a\u00020\u0007H\'J)\u0010\u0093\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u0007H\'J4\u0010\u0094\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\t\b\u0001\u0010\u0095\u0001\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010R\u001a\u00020\u0007H\'J)\u0010\u0096\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010:\u001a\u00020\u00072\b\b\u0003\u0010>\u001a\u00020\u0007H\'J\u0016\u0010\u0097\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0098\u00010\u00040\u0003H\'J\u0015\u0010\u0099\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u0003H\'J+\u0010\u009a\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00040\u00032\t\b\u0001\u0010\u009b\u0001\u001a\u00020\u00072\t\b\u0001\u0010\u009c\u0001\u001a\u00020\u0007H\'J\u0016\u0010\u009d\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009e\u00010\u00040\u0003H\'J)\u0010\u009f\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010M\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\'\u00a8\u0006\u00a0\u0001"}, d2 = {"Lcn/lvdou/vod/netservice/VodService;", "", "addPlayLog", "Lio/reactivex/Observable;", "Lcn/lvdou/vod/bean/BaseResult;", "Lcn/lvdou/vod/bean/UserVideo;", "vod_id", "", "nid", "source", "percent", "urlIndex", "curProgress", "playSourceIndex", "addWatchTime", "Lcn/lvdou/vod/bean/GetScoreBean;", "view_seconds", "", "buyVideo", "type", "id", "sid", "mid", "pay_type", "cardBuy", "Lcn/lvdou/vod/bean/CardBuyBean;", "card_pwd", "changeAgents", "Lcn/lvdou/vod/bean/ChangeAgentsBean;", "changeAvator", "Lcn/lvdou/vod/bean/ChangeAvatorBean;", "body", "Lokhttp3/MultipartBody$Part;", "changeNickname", "user_nick_name", "checkVersion", "Lcn/lvdou/vod/bean/AppUpdateBean;", "version", "os", "checkVodTrySee", "Lcn/lvdou/av/CheckVodTrySeeBean;", "collect", "comment", "comment_content", "comment_mid", "comment_rid", "deleteCollect", "ids", "deletePlayLogList", "downloadAPP", "Lretrofit2/Call;", "Lokhttp3/ResponseBody;", "url", "expandCenter", "Lcn/lvdou/vod/bean/ExpandCenter;", "feedbak", "gbook_content", "findpass", "to", "user_pwd", "user_pwd2", "code", "ac", "findpasssms", "getAdv", "Lcn/lvdou/vod/entity/AdvEntity;", "getAgentsScore", "Lcn/lvdou/vod/bean/AgentsScoreBean;", "getCollectList", "Lcn/lvdou/vod/bean/Page;", "Lcn/lvdou/vod/bean/CollectionBean;", "page", "limit", "ulog_type", "getCollectList2", "getCommentList", "Lcn/lvdou/vod/bean/CommentBean;", "rid", "getDanMuList", "Lcn/lvdou/vod/bean/DanMuBean;", "rel_limit", "start", "at_time", "", "getFeedbackList", "Lcn/lvdou/vod/bean/FeedbackBean;", "getGoldWithdrawRecord", "Lcn/lvdou/vod/bean/GoldWithdrawRecordBean;", "getMsgDetail", "Lcn/lvdou/vod/bean/MessageDetail;", "getMsgList", "Lcn/lvdou/vod/bean/MessageBean;", "getPlayAd", "Lcn/lvdou/vod/bean/AppConfigBean;", "getPlayLogList", "Lcn/lvdou/vod/bean/PlayLogBean;", "getRankList", "Lcn/lvdou/vod/bean/RankBean;", "order_by", "getSameActorList", "Lcn/lvdou/vod/bean/VodBean;", "actor", "getSameTypeList", "zlass", "getScoreList", "Lcn/lvdou/vod/bean/ScoreListBean;", "getShareInfo", "Lcn/lvdou/vod/bean/ShareInfoBean;", "getTabFourInfo", "Lcn/lvdou/vod/bean/TabFourInfo;", "getTabThreeName", "getTaskList", "Lcn/lvdou/vod/bean/TaskBean;", "getVideoDetail", "getVideoProgress", "getVodList", "Lcn/lvdou/vod/bean/PageResult;", "wd", "goldTip", "Lcn/lvdou/vod/bean/GoldTipBean;", "goldWithdrawApply", "Lcn/lvdou/vod/bean/GoldWithdrawBean;", "num", "account", "realname", "groupChat", "Lcn/lvdou/vod/bean/GroupChatBean;", "login", "user_name", "logout", "myExpand", "Lcn/lvdou/vod/bean/MyExpand;", "openRegister", "Lcn/lvdou/vod/bean/OpenRegister;", "order", "Lcn/lvdou/vod/bean/OrderBean;", "order_code", "payTip", "Lcn/lvdou/vod/bean/PayTipBean;", "pointPurchase", "Lcn/lvdou/vod/bean/PointPurchseBean;", "price", "register", "registerByCode", "replayComment", "comment_id", "comment_pid", "score", "sendDanmu", "content", "sendVerifyCode", "shareScore", "Lcn/lvdou/vod/bean/ShareBean;", "sign", "upgradeGroup", "long", "group_id", "userInfo", "Lcn/lvdou/vod/bean/UserInfoBean;", "videoCount", "app_release"})
public abstract interface VodService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.danmu/index")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.DanMuBean>> getDanMuList(@retrofit2.http.Query(value = "vod_id")
    int vod_id, @retrofit2.http.Query(value = "limit")
    int rel_limit, @retrofit2.http.Query(value = "start")
    int start, @retrofit2.http.Query(value = "at_time")
    long at_time);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.vod/detail")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.VodBean>> getVideoDetail(@retrofit2.http.Query(value = "vod_id")
    int vod_id, @retrofit2.http.Query(value = "rel_limit")
    int rel_limit);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.vod")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.Page<cn.lvdou.vod.bean.VodBean>>> getSameTypeList(@retrofit2.http.Query(value = "type")
    int type, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "class")
    java.lang.String zlass, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "limit")
    int limit);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.vod")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.Page<cn.lvdou.vod.bean.VodBean>>> getSameActorList(@retrofit2.http.Query(value = "type")
    int type, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "actor")
    java.lang.String actor, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "limit")
    int limit);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.comment")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.Page<cn.lvdou.vod.bean.CommentBean>>> getCommentList(@retrofit2.http.Query(value = "rid")
    int rid, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "mid")
    java.lang.String mid, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "limit")
    int limit);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/mc_api.php/v1.comment")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.GetScoreBean>> comment(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "comment_content")
    java.lang.String comment_content, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "comment_mid")
    java.lang.String comment_mid, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "comment_rid")
    java.lang.String comment_rid);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/mc_api.php/v1.comment")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<java.lang.String>> replayComment(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "comment_content")
    java.lang.String comment_content, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "comment_mid")
    java.lang.String comment_mid, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "comment_rid")
    java.lang.String comment_rid, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "comment_id")
    java.lang.String comment_id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "comment_pid")
    java.lang.String comment_pid);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.vod")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.PageResult<cn.lvdou.vod.bean.VodBean>> getVodList(@retrofit2.http.Query(value = "type")
    int type, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "class")
    java.lang.String zlass);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.vod")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.PageResult<cn.lvdou.vod.bean.VodBean>> getVodList(@retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "wd")
    java.lang.String wd);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/mc_api.php/v1.auth/login")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<java.lang.String>> login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "user_name")
    java.lang.String user_name, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "user_pwd")
    java.lang.String user_pwd);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/mc_api.php/v1.auth/register")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<java.lang.String>> register(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "user_name")
    java.lang.String user_name, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "user_pwd")
    java.lang.String user_pwd, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "user_pwd2")
    java.lang.String user_pwd2);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/mc_api.php/v1.auth/register")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<java.lang.String>> registerByCode(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "to")
    java.lang.String to, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "user_pwd")
    java.lang.String user_pwd, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "code")
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "ac")
    java.lang.String ac);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.auth/findpass")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<java.lang.String>> findpass(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "to")
    java.lang.String to, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "user_pwd")
    java.lang.String user_pwd, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "user_pwd2")
    java.lang.String user_pwd2, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "code")
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "ac")
    java.lang.String ac, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "type")
    java.lang.String type);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.auth/findpasssms")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<java.lang.String>> findpasssms(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "to")
    java.lang.String to, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "ac")
    java.lang.String ac);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.auth/registerSms")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<java.lang.String>> sendVerifyCode(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "to")
    java.lang.String to, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "ac")
    java.lang.String ac);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.user/phoneReg")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.OpenRegister>> openRegister();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.user/detail")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.UserInfoBean>> userInfo();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.Vodad")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.entity.AdvEntity>> getAdv();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/mc_api.php/v1.sign")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.GetScoreBean>> sign();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.groupchat")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.GroupChatBean>> groupChat();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.user/payTip")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.PayTipBean>> payTip();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.user/goldTip")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.GoldTipBean>> goldTip();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/mc_api.php/v1.user/buy")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.CardBuyBean>> cardBuy(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "card_pwd")
    java.lang.String card_pwd);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/mc_api.php/v1.user/group")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.CardBuyBean>> upgradeGroup(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "long")
    java.lang.String p0_1663806, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "group_id")
    java.lang.String group_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.user/groups")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.ScoreListBean>> getScoreList();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/mc_api.php/v1.user/changeAgents")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.ChangeAgentsBean>> changeAgents();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.user/agentsScore")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.AgentsScoreBean>> getAgentsScore();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/mc_api.php/v1.user/order")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.PointPurchseBean>> pointPurchase(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "price")
    java.lang.String price);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "/mc_api.php/v1.auth/logout")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<java.lang.String>> logout();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/mc_api.php/v1.user")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<java.lang.String>> changeNickname(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "user_nick_name")
    java.lang.String user_nick_name);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/mc_api.php/v1.upload/user")
    @retrofit2.http.Multipart()
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.ChangeAvatorBean>> changeAvator(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/mc_api.php/v1.user/goldWithdrawApply")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.GoldWithdrawBean>> goldWithdrawApply(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "num")
    java.lang.String num, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "type")
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "account")
    java.lang.String account, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "realname")
    java.lang.String realname);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.user/goldWithdrawApply")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.Page<cn.lvdou.vod.bean.GoldWithdrawRecordBean>>> getGoldWithdrawRecord(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "page")
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "limit")
    java.lang.String limit);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.gbook")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.Page<cn.lvdou.vod.bean.FeedbackBean>>> getFeedbackList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "page")
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "limit")
    java.lang.String limit);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/mc_api.php/v1.gbook")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<java.lang.String>> feedbak(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "gbook_content")
    java.lang.String gbook_content);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/mc_api.php/v1.user/ulog")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<java.lang.String>> collect(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "mid")
    java.lang.String mid, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "type")
    java.lang.String type);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.user/favs")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.Page<cn.lvdou.vod.bean.CollectionBean>>> getCollectList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "page")
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "limit")
    java.lang.String limit, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "ulog_type")
    java.lang.String ulog_type);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.user/favs")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.Page<cn.lvdou.vod.bean.CollectionBean>>> getCollectList2();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "/mc_api.php/v1.user/ulog")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<java.lang.String>> deleteCollect(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "ids")
    java.lang.String ids, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "type")
    java.lang.String type);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/mc_api.php/v1.user/shareScore")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.ShareBean>> shareScore();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/mc_api.php/v1.vod/score")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.GetScoreBean>> score(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "score")
    java.lang.String type);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.user/task")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.TaskBean>> getTaskList();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.message/index")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.MessageBean>> getMsgList();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.message/detail")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.MessageDetail>> getMsgDetail(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.user/userLevelConfig")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.ExpandCenter>> expandCenter();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.user/subUsers")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.MyExpand>> myExpand(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "page")
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "limit")
    java.lang.String limit);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/mc_api.php/v1.danmu")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.GetScoreBean>> sendDanmu(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "content")
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "vod_id")
    java.lang.String vod_id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "at_time")
    java.lang.String at_time);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.user/checkVodTrySee")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.av.CheckVodTrySeeBean>> checkVodTrySee(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "mid")
    java.lang.String mid, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "nid")
    java.lang.String nid);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/mc_api.php/v1.user/buypopedom")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<java.lang.String>> buyVideo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "type")
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "sid")
    java.lang.String sid, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "nid")
    java.lang.String nid, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "mid")
    java.lang.String mid, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "pay_type")
    java.lang.String pay_type);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.main/version")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.AppUpdateBean>> checkVersion(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "version")
    java.lang.String version, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "os")
    java.lang.String os);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.user/order")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.OrderBean>> order(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "order_code")
    java.lang.String order_code);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.user/appConfig")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.AppConfigBean>> getPlayAd(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "type")
    java.lang.String type);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.user/shareInfo")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.ShareInfoBean>> getShareInfo();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/mc_api.php/v1.user/addViewLog")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.UserVideo>> addPlayLog(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "vod_id")
    java.lang.String vod_id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "nid")
    java.lang.String nid, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "source")
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "percent")
    java.lang.String percent, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "urlIndex")
    java.lang.String urlIndex, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "curProgress")
    java.lang.String curProgress, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "playSourceIndex")
    java.lang.String playSourceIndex);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.vod/videoProgress")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<java.lang.Long>> getVideoProgress(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "vod_id")
    java.lang.String vod_id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "nid")
    java.lang.String nid, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "source")
    java.lang.String source);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/mc_api.php/v1.vod/videoViewRecode")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<java.lang.String>> videoCount(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "rid")
    java.lang.String rid, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "nid")
    java.lang.String nid);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/mc_api.php/v1.user/viewSeconds")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.GetScoreBean>> addWatchTime(@retrofit2.http.Field(value = "view_seconds")
    int view_seconds);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.user/viewLog")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.Page<cn.lvdou.vod.bean.PlayLogBean>>> getPlayLogList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "page")
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "limit")
    java.lang.String limit);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/mc_api.php/v1.user/delVlog")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<java.lang.String>> deletePlayLogList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.zhibo/thirdUiName")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<java.lang.String>> getTabThreeName();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.youxi/index")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.TabFourInfo>> getTabFourInfo();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/mc_api.php/v1.vod/vodphb")
    public abstract io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<cn.lvdou.vod.bean.RankBean>> getRankList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "order_by")
    java.lang.String order_by, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "type")
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "page")
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "limit")
    java.lang.String limit);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET()
    @retrofit2.http.Streaming()
    public abstract retrofit2.Call<okhttp3.ResponseBody> downloadAPP(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String url);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}