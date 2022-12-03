package org.example;

import java.util.ArrayList;
import java.util.List;

public class Day3 {
    static String input = """
            pqgZZSZgcZJqpzBbqTbbLjBDBLhB
            wHptFFsHttHFLMDQDFTbbj
            fVfvsstwPHwNwfNGfHWRSnlpClcJzCWCzddSrddg
            bdgHbZJHgMHgJgJctDtVssVcpFtq
            rNNQqBSzTcBPTDsP
            GWNNrhGnNnWNzRfnRQRbhCdqHMbdmbZddbmCmd
            BSBDzrSwrqccDDwbfcBjsRwggClslTRWGWGMFlsF
            dnhVhLJtzNZdgCRlsTGWCRJG
            ZHZdNzptLNtPhPdnprPbbDBrSqrSQPjbqD
            rlSwlrGvwTTSwSggCJGQJdhVgJGQ
            jcrHrMWfNHNzQgVH
            WbfjmBMrBrrmLtqMbwwsPTvPpwvBPFPsws
            NRNcHzbzbMRcNPjPrrlBPlbtBl
            CZwVCCpWggqprwtlHlssHtPr
            WpmLghCVCqCnmVTLnccRQvvQQHDhNQzzzc
            NvGTmNGDJsrCmCWPHpCP
            nqfVfnFQnZQfFqzMZBPtppcBPPCBptcrbF
            fhRSSVfqMZZhMnQfjVzShNNlLvldsNDdvvljGpllDT
            JGRNWRGJbGmCGRbLmGpqShhcQpQgCcncScSQ
            FFdtjvvpvVFnQhhnQhgf
            ltvjjtjHlzBtWRmNPLZRHLpH
            FFCJFsvgLsjLgWzJFWJgGwBDbwnbwlDddqffnjnlnd
            pTpTMQpMZHQhZQpHPZMmTMlwhDNNddbnDqdDwwlbVNVd
            SHpmrHPZHQpmvFrqsFvgCsRq
            TtWpWhQlVZrVptJhtrtdbLPDPbjFbCCWCvFFbLSN
            zMGlnlsgSSvjjGSF
            msznlgcwMnRwznmBqTZQJrddhfQJtBJtZQ
            mwTwLftmqqSHWfCfLHjWftBthNNNVrlcFRVNrNrRTrMgrRNg
            pvJPJQPGPPzbpVpVlMBVchFl
            bzQPQbQQdsDZPDGJnBGnPGnjHDttqqqqmCjftLCmWmfftC
            ZNpfdHcccTfdwfMFNjBttMgMbBnvlvjBmB
            QVPsGzhbszRLRrgvtgjWgljlRtgt
            VJrVLsSrzLzGPChVGzbrrfpTSHFfDDHSdpZFfHpDTZ
            NPpvDbmbsmdbNvQvDdWQpmWSnnQCLBnCcQSCnnLlwCBlZz
            jggrtGTFhtGfjhDVjrjgMftFwnZcwwBCnzzVwBBwSZcVwLSw
            JfHftHhgftgFJWPdPDWRPDvPJv
            ZSLLZJGglDSVNDGGGgGgngGmHrfLzmHvvjfjwLhHvLfHHr
            QqFWszFMTQFdFPMqBmWBHvfhCwCjhHff
            pTsdppTMPtqqdbnlNVzJVbSSnbZR
            gBqDccrrJDwmpTWHHTdWMPWWZFHF
            RNfnfSwRjlLSWjQMHWvQZtvH
            GRLbnzNnzVRLCqhwzwBmJrmc
            CcGnZGnGlRncsspmFmmcmGRJJzCDTzjLBSDfqjwDDzDLDB
            hHrNdPWhrbPdhPgVWvvrgWdfwjfNzSqfqjLqzfBTzJzJTz
            HHQhhvMWbbdRswmlsmwsQc
            rrwhpZPrccRpQdcFDJNqhtqtqMLhqfMh
            lTtTllgbzTlJsmDMvbLbsf
            VVWBTgzlzgGnngrtQRQRtCtwZRQB
            HGnGvVdLhlFcmvPWmT
            jwBLqZgjrtjqmFsQTscPQs
            ZBNZtwLwztLpMrfZBLMdbdnfSRVVfnGbnfDVGh
            LmBBBzQrBgBhmmggmtdVdhJNMHNdhsHNDd
            ScSZbRplCcMnSpvCfCCZcpPwtJPNtHPHNVVNtPddwlNH
            CpvpZGfnffSpnvRSSbcfScQBWrMWmjrmFFBzTGQWjMmL
            sljSjSgsjcCLllsjVgSjCtspQwvNNhdFwFQvwpbtmhwhpN
            hDqqWzGRHHfRrJnrWrfWfHBdFmBFmBbdBGBpwmFdFpww
            TDnDHZrWWHhTjPClClSP
            wGNQGQDGjqqmwHHs
            MWvvrzgfsdWsvMrSdqJqcpgHgnqLFLnjpH
            fvsPMsPdrTZhChNDhbhPVN
            sbMgDDtttVvpMtcJsgcGGBBfGLBSLclQTGPS
            CWHWzhhRRHjqRmSGPfBSzJfSBnBB
            HjjRHWFWhRRwHNmCCRHhhFdNDNrdptMstJvsbMDtVptd
            RnSwRsLsnSswjDDDBJPrJv
            cpzCzlczHTJVQhvBQlDVDj
            WmGzqTmHSsffqqnJ
            vQSPHMwpmpQMLGfTPVLRPRVP
            hsWhnncsJqbGjGfcfBMMRR
            sqdNWqqghbsJslgsJqgWllMWDppSvNCHQHDSSHrHrHCSvvCQ
            ZWWnWMmmndQZmffcdZcmssQqrsptVwwTtQHTCTHH
            SvvrPzvvFDzGzTszpGGwHT
            vrRLjjrPhLjrjPDSfdcMZnmdcmJcfcRf
            HpqWhDJjzmcTSbmMBVBb
            nCzfLtFnZZrcbcVVfTBfsc
            FtRFzgrRtnRzrFwzDjljpjgHNJDlNlhN
            gtNRRSSrRmjshHmm
            PQDMwPwMppcQQcvCFlhLhGmjflctlnHGjf
            QwDMFFdtwFDQJZZZNqSqJSqBgBqTNJNg
            cddzbbzQflTDcDfRbcfbJVsplVsChNghHNsSsVpn
            FBWFWjFFCjWPBSPPJsVpppPSVH
            CrCwvjWvmqmvrBvFwZRGQQDDcGTcfbddZdRc
            ZBQqdGLFmmzDmTZz
            PvrVMvGgWmwSmllglS
            NrfGnvWWPhfpspsGvLJBsFBbqJCbdQcLBq
            DrwTrlfGThhQTpDdWSWgdgwLLgBSZH
            bqbPRVRmzJCLWSgCzCLH
            jRtbNVtNjNqRqsJtbjbMDQHQGlchfQpfsTcHpGHr
            tMnRcnpDcZtpQDSCCsGGHvcGPGqGsr
            mzJmjWJNlbfmbhzVCCPmZrCZqPGCgZ
            JWhzjJBdWnMLZtSBTw
            tvdLttzvtHLztnQpssdTPbMqbqMTdTss
            jhSRGNjjSjhSDCNhRgRgclNjmfZTPnbTMqJJfqqsbMflTfMs
            WnCjcjDRCChSNSCNDjNhGVDtQvVLHzFrpFwFrHFQQwQpzp
            fLbLLLLQhVPhBVmDwmCfwsdwwDps
            GNtctFTSrrJqGGpHFcTJFTwsslwmlmWsdsqRRCmqwdWs
            ppctFTTSgHcSrGrrTGFcrrnhhQbPLbQZgzLvQQVVvZvLhv
            mBBWnnBbBCtssmRThRDllR
            wfwFQcpHFpddFrwpGcHSHdcjQZZlqqDTTjZqssRhWllssj
            dWfrcSGFpgrSzFgMbCPNPLtCtVMV
            llLlGLJJMjJMGVSvVMSLRRHvjCZtgZccttnmbCtdCcmCCztn
            sBQNqPhsrrqrrwrsppsHswsZcmnNCzdZtbgntcNgcctnCt
            WWFBBsPwpWPwBBHpFFrWGRMRLlJfJVMJRJLWSJ
            vgMvQnPMntnSQPSgMvSMpNJfJDNNRpfZmGQmbDND
            HlbjHHBLjCHGZGpfJLpfwm
            qdHWqBbbbjrTzdqFqssvtPMSSFFg
            TGDfDHSgtTzPPbnCtnNtVn
            WQrWMFpMWMQbCVNPRWVWWv
            pdpMMrhrprQshlMFjZpdjZMgmlGJJGlGDBmgmHgmJCSBHG
            zWWBjZZjWPFFPPnBCVdsqmnCdSLn
            rJvpbvbpGgTGrNJGGpRRhsCqSsLhnsmTVnSLTLHh
            gNNNJDbpvGNfvNSDPPWQWWPZZWtjlQfc
            RRVbWWWvvZVWmsFSsDNbHsDSsg
            CrTwJQJpJpCCwvlJQTTPsfzDgfwNhszfszFhzFDh
            ttQJtvjpPvcqTllJTPtPRGMGRGLWdVZLVZjWdMjj
            NnPCTQWMMQNNNWwWnMzpHczzsZcCscddHdGs
            mqRgqqVlLgqmfVzcGpzzSHGZcgcz
            tjmZjZmhqftlJRJhlTMPTPQbrPBBWnhnnT
            hvTQqpvTqjvhpjnCqmCnSDSFDWFFLSSSWDnSVL
            tZwGgsfPcltgcZltRgNSDSSSSldmWMLWFVHd
            GrZtwRPbGwwPcGRsZGtRtgQJJhCjpzmTBTvJzJrjvzQp
            rwmwqDWwfDtztnFGBB
            LPdpdVcdPGvPVgZsPtlhTTtthHBhHF
            dRdCjvpCRpjvCMZgvLgRVJJSWMqmbwQJbMWGWQNbbQ
            CMCcMcDGzBGPmBmznTNbnGbrswNTwTvN
            SSHVWZphqWWJJzNsbnFwFVNjbz
            flLQqHzzgtQdcDRB
            mdzvFtllBgFttGnvfMwMVRRZCThSNZVhMd
            pDTrDHjWWJPqjDjDSMqNwSZRZhNSRNCZ
            jpcTpQPWLLpDTLcTrPjPDcjzzFLFzvgLzlzfvGFgfmgFzF
            fQVVPzBpFVVrtrsJ
            PldSLNSmWwMCcCMMcCNN
            mSPlldllmPdRnLRwmbnLwmwvTjBTghTHQjfgjpZHpfHHfZbZ
            pmfMcfprMqMrZZJcMZMGWTsFCVCTVPPsVTWCGPDP
            vrvvvLRbBNNBbvBbjBHbQhgDslPTWsPTlFDsFTFwTWlDVQ
            hgjznNBjHHgrhRHgrRLRnRfSSJmdqMfffzqJptdmmmdd
            nRnPlCRPWPMFqwPLwq
            tBGfbSbHtBVQgrbrqfTFFLvTNLLNGTGMLdws
            bgHVtBDtqnqqlJRD
            SdSJrHssFBSVsNtMMdRWnTRhRl
            vcvfDvgvcwvFRlbnwWRlMhtn
            DDDqcqFZQPgcgcfvDjLDfVrsSVrHBLJVpLpCSppGpS
            gJGTFLTdrpLdBcWBvnllvlMvMC
            RRqbbQhwNZZwQRPrSZWnvHSZWSvSZC
            fQDNRsrsQzfbDrbsqwdtpgJVjdJdpVfJFLFF
            DzWqFvqpqFSCSzGRGmwfntGjmR
            cbhZNJQBtgMHJbJcNcrmfhrRrswmfRwnVrhG
            bJNgbNdJBBPMHbcMNMWWvSFpDLFvCStqpLdv
            sLsHTsTbRLRwqssHwHjFrPDwJDppzFDJmmcrPJ
            BnZGBlMZnQSgSnvVSMmJzPDCzFcrLPPJmpDG
            BgBffVLhQLgvnBRRssfqdfHbHdNT
            HRPVmjqBqVjVRRPmcPmJjbDgLDDshbfRLlfbfLbhlL
            rtTzSMSMFpTzfgDzzgsLfLHZ
            rNpGpSSHwMTrrdHGNtTPmVjnGGjVjmBGmmBjJB
            DBqDQDQHSFlHsFnN
            MfLfwwLMWGLrWMMnpSlsnGJJlbFVjV
            gRhMZzhrFLWQvTPqTPcvvh
            NwwsHwtnFCtzcPdbvrQbBqclQq
            VmZLLTLfVpwMBrVVqqMM
            mgJDjTgWgLWDppJZJTWZmSRzCtRHhGGwHNzshGFFCSRt
            RGCCDRdFZdRCMzzGCDGCmGHMfqbNNNLQLfFqnnqnNQqVPnQn
            glgcrwrJjJccBwdSfnSnVqrqQVVnNq
            jvtBsjstgstjltBcWzTGGddHTWDTZCmDGm
            HJHGZZHnctSSDhZtmZ
            MjjQFSvQlRjSdRqdqvVSqCCPtpRpPPDfDmfPbbpphC
            SNsWqMNvFFqdqVMgwwBHrGHnHgcWTJ
            jBcbjSmSBbbCcPcMjmbzFPhDMDfrfGRhGQRMnGQfdrDh
            wHlqwlqpwZqcwVlqHtJVJLTdhndTDnhffftTGDTTDdTG
            JNllcwpZZlpZJjNzSzSCNjSmFN
            FhwRPzmPWmQQmwFPGGMGGRPnRHHVfDbvJlvDlHSvDTDfVHbD
            NpjcpCdqpZZvwvJVfDdDHT
            twZtqrBrBQBMBPGn
            fBFGjbLLFblmbWFmVfBvrvMdMdncnrdNbdQNTr
            shZHHRZhtsqJZhHhgZzgJzVJrrSSvrMdMQrNTvMNJQNrdn
            szHwgtHtwPzPLpVFpVPLlfLC
            mrsrtrWjljjjvwwgNnZfDHJDqTqrHL
            FccMPFQcpczpdMPhMqJngNfqfnFgDnnFfg
            BdMpdcDPcpjBmlBmVWts
            VvwTTlfVlblwwSsbfTdzVqjhzVjpjjqjqpzV
            rwCWFGmJrNCmMRHmwRFPmHQQhBLBzdLqBjhLBHZdQB
            rFwDrMNRJDJFPRmCvcTcbDsvstTgfTsg
            zhRzdRRChHCFGPDRvWRWvWvHpZpscrrmrZrJcmspJmJZFfpM
            wQqLtQLtnjbjVnVjbBgjbBnbMZMZJlVpZfJprsMprmGZZZml
            jQjjNBLLwjtQBtwwdGGDCHhNzzWDzTPD
            DzzQnCMMznFnCdnFFlHtlmhVRtmVVmVhSF
            PWrPPRTfLJJtfbtBfV
            wsrggZsTwTTWGvDppQMRjjMCjMZp
            fTjzZVTlbffCMvjgMpSFWBNBWSFsvBsNNccF
            nJdwdPRQqGqbGJQbmmQQhRSBBBSsPPHWNSWFBtDNBsHH
            nnQhwwQGdLqqwnZbpfjMfzpzLbLj
            jgTgCwgjMgGLhvRrHrHwhvhV
            bqSsSsZFZBlFsBlTSppVvVvnVHHvHnhp
            qFlbPbFFsWFsBlFWbsbsmzTcMjLmtfcCmcWtgzgm
            rrHbfBLbfMcghcmrcCzg
            RDStDtvdZRQdJSQWWWdvFSgNvVcnghhmnnzhVPhczPch
            ZtJpJttSZStwtttFDQmLGTlqMLqGfwTTGLfTGG
            MrfLWwfBwgghvLmNvmHHHGGQHQSSscscVvTV
            dDjZjDPJtFRzjdTTsqVjTpqHsGrT
            JbFtlbPRJCzffBrgnlMWmg
            ZFsbbVLLdZppLFpcJjCCQJlGcQCMZq
            TwRtRBdBClCTGlcJ
            rwBvBzDvwNNDHLHzfHssdHhS
            gdhgftTNGTbpqJqjjgRJ
            lcBcMLFzMzLFMzFzPjRBQjQPQpSqhpbp
            mzzmZHZZnZwLhtGfddVsNCCnGG
            lblbPGSGrTLRwqZLvP
            FffCCFzFCWzzvmjRJnRTnZZNJCTqCR
            gdhztVjhHMsGvrGVVB
            ZJZjJGHZhDJRFJHjDZjhPNFgFmrnVmgVVzVBscnzSg
            bwlWtMwtbqdCvlQCplmsqgnVVScnVgmnmzNs
            WMWltTtvvCdwCCRPPfTHGcJDfGZL
            svqQJLvSSZrZZZCFCBDPDCMTDpPwMWDPCwRw
            GnlnGbdldjhzzhpPDTWjmtMwPmWW
            HzVbGnnbchblbnbzcQTZBZrQrFSHvLBBJv
            MmgMmVpcRDlvbvpHJF
            GSGTLTwhwwhzQqTqwjFlbdvdbrlrbrrDnDvHlQ
            zLNNNtwGFCMsWsCWNR
            tSTDDDftSqSsTDnTtCWNrbFsNJJvbzJbvJ
            dhRdVHdMGRgPJbjNPbzgvr
            VllQmQdhRHLhhHmLlGzSqSQDDcDBnnBnqDfSct
            zBzJWZBLZNNGLsbTvLbmbT
            QdtQwfdnPdPTbsRQGhRvbl
            pgtPgPjVDnpVnDtPTFFrJJTBCcpcrpCW
            GnWMfBfdCGMbjRNpnzvvNLRNVv
            FShJDJJscwwszNjvNjNNqZ
            tJmccwlcFlFcHlPcHFfdrbBGBGfjCGTfBCPf
            GhlcQsZNQZWhpcGhwlPmqnnqnjJjLRnqzJsJLJ
            VTMtTtDTbvbMTfvdJqngjmqzdjmJjCLm
            vHtbHTDBFvffBPGwLLZBQNNl
            bDphJrpbpnBbDrdBvJdDFBMtMlfgtsFSstfGPPgggPGP
            RZmNjTZQNVHQHNGSgMsfPlShSs
            VmchTLZQLjVLjmTVmQVhTmwVrWJqbDqddBrpnWbvnqrqcnJB
            jWWgThWtgSvSSWlJtlShllPcHVnJHPbMHPcPVPbVZrHM
            fGdfRsRdNwfRQhnpcZdVhVpbPh
            fGhwNBqNjqStFqtj
            TSTBrSDlQlTDrrQclrBSLffPvcfcdVjVMGGPLjLL
            qnbnbngFGhhhPfjjVffjff
            RRWbmgpnmqlrCwwSrwmG
            mZZTsdBZVZBZLVHdFmsNnCrCVQQbWvWjWNCnbg
            QSffDGwGGrPGWrgN
            hflwzltflDpMpDSllcMDhSShdsdZQdLZZdHTssZzmqLzFmLB
            LLRJRshLfsJfWnLBTlTBlFzNrnrBBl
            qmmVwmdHqmqGHZdHbbqSScdZQTjjpTFFVBBrlDrzDFBTjFjF
            wZZwmcbvHgqTmGccmvdCLhCPJsJCPWgMLPtJsJ
            TWbbbNbJJjJbqTjtJJjTQCtnGSBndMGCcSZSQwCB
            mcfRfrcmrDRrPsdQSGZQGnsSQMnB
            DDRLDRDFPpgmpcgPghpfgvRTjbhTVjHljJjzlVzVTlbHll
            rPlPrPllBGgJgdJfHgfjJt
            pppZVfFDWssMfFVVFMpsMMVmHCRLdcZCRtvLRdCtCJdHRttH
            mDMfDFDmnMMmsMFznDFpzswbNbPGwwSGBrGrhrTzThSl
            qDNFfCCNWLfWWhqhDGPMMZVwgpCpMbJwJCvV
            RdstRRvdtmtPVpppVbVtrp
            zzncSRdsTdQTczQBsLvvHNhDWGjDHNLDSG
            bNNpcfJcCtNpHFsJsGGjLGzmLjLmGzlFGW
            qwqZdnQnQwnhhzmnMWjmNlMzLr
            qhwwQSwStJbHNftS
            WlfWSwDftzRltBWVlRDlsmBJPcsZPmcJnmPmFhrn
            dLQbQbvGTddTvbjQCbLbhmCrZZPPsshPPPrJZrnF
            QgFjQHHbMvdRMVllSqfSlf
            MDPJBWWPggVlPVDMSljdZNNpwjwbHZpNbDdH
            mGmzcThGrtntHhthzGctRbNRNwRNzZwfdZpjpdRj
            ThtcvvtThFcnqFQSHgBSVJll
            hVqhFLBngHVFtJjtLCBJVSbbPNNbSmfLLTSNSrrLTb
            vsdZZpvQdczlMdMvzlcvvdQprbGGTfSbWmzPTgmmGTbmmfGP
            vgRZZMgwdgsQZdMBqVhjhJqBhJtRhq
            bgFQbMMbTbQhghddFTFGnmSmsNdzHvzSSzlcHsls
            fZDjVtfZLqwpqtCfCjCjlvqScrvzqHSzszzSnczr
            jpftjCfWCjCfCRZZlpCpjRWQBRTQQbgBBTMbghgbbPGJBJ
            VZZrbBVwbbbVVvgbntnggNRJqRRNNccMcNqJcJ
            jfDPfDdGGhDGfGFPCcZQqMpRNJhqTcMc
            LPfffPHGPDjPFGWSdHPFjWtlBlwvlwBlbtmLltsmvtZb
            TTfJDfrJTSrHMcVMJDTfMcMDBQBPwnPlznPszFVBFgzFgnsn
            CqtmWNNGBPzwbbwm
            htdCthhWGtWWGNZqcZpJjwwHHHMcHZDM
            VvjQjQCZLbbSbTPpSHtFzsHzppMfzz
            DJrJWBcDcWJWmmcgGRGRGWGDzHHwzdfRHpMztMpfdFdFdzdM
            DmBgGDqJNhGcccWmcZLjTPLVLTQhPtvvTZ
            qfhvwNDQqwDGdGZZGwPTTw
            STsJgsRtJMZPjlsmdpbs
            SCTTHTWHNVfHQqqq
            djCDgllgjJjDRRNgRlDdBgtpQHfhQTrLLrGBtzrQhpBH
            SVcsMGcPSbqSPmLTPHHQTHrftPTr
            VcWnsScqSScWcZbMMcSVGbNNlgDRlgCCNgwWvvRJdNdj
            mgPllfRgvNmPGQGGsmQNWlpFtnBPFShncTFShtFShnjS
            tLLzMJJwwbbdrrMLqLVJMzVZFnpTTFpnCSSpShCjBJhpThph
            HMdVwbbLMbDMDVlmDsgtNtNRfgsm
            hNsgsgzNZRghPhZBdssPQfzDmQSmmzQGJWzfCDJJ
            bblVHvvHHTljwFCfGrvmfmmJBmGQ
            THMMFVwqTPRdZptMBP
            QvcPGSvQLjmcQWSGWWGjLCNhhqpCdBCNCbJNdVWpCh
            rwtLlzZggLHnHlwHRDdVqBbCdqqVVhbqVnVh
            zRDzwRrwlRlRTgrDtllmQGLcPjGLccFmTcGSQc
            RWlgQlbcWBwzsJggTfhh
            GrnLjHLjmLjjGSLjSDmfJJpfThhfSWJPqJqhwz
            vLvDDnDNrCVjCmNDbFlBVZdVRQlRbWcb
            mTlwFngwmlLlvsmLHmHsLJhJFfcbdpbNcjCNCbpccb
            tZRzBRzBBRQzPqGRqrVQtjjfbCMcfMfCMMjVjfCJNd
            SDBBPtZZTdnnwSvg
            nddNNMMPNBnBNnBTQSShlSHghlDHBr
            VcccVmqJsJsjlTmzTDggmHHT
            VqLtFCqFJfVtVjsNgPNNMMWNwgtNvn
            """;
    static String testInput = """
            vJrwpWtwJgWrhcsFMMfFFhFp
            jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
            PmmdzqPrVvPwwTWBwg
            wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
            ttgJtRGJQctTZtZT
            CrZsJsPPZsGzwwsLwLmpwMDw
            """;
    static String pointString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        List<String> inputArray = List.of(input.split("\n"));
        part1(inputArray);
        part2(inputArray);
    }

    private static void part2(List<String> inputArray) {
        int totalPoints = 0;
        for (int i = 0; i < inputArray.size(); i += 3) {
            String firstRow = inputArray.get(i);
            String secondRow = inputArray.get(i + 1);
            String thirdRow = inputArray.get(i + 2);
            for (char c : getCommonChars(firstRow, secondRow)) {
                if (thirdRow.contains(String.valueOf(c))) {
                    totalPoints += getPoints(c);
                }
            }
        }
        System.out.println("Part 2 result: " + totalPoints);
    }

    private static void part1(List<String> inputArray) {
        int totalPoints = 0;
        for (String row : inputArray) {
            String firstPart = row.substring(0, (row.length() / 2));
            String secondPart = row.substring((row.length() / 2));
//            System.out.println("1: " + firstPart + " 2: " + secondPart);
            for (char c : firstPart.toCharArray()) {
                if (secondPart.contains(String.valueOf(c))) {
                    int points = getPoints(c);
                    totalPoints += points;
//                    System.out.println("Adding points: " + points + " char: " + c);
                    break;
                }
            }
        }
        System.out.println("Part 1 result: " + totalPoints);
    }

    private static List<Character> getCommonChars(String first, String second) {
        List<Character> result = new ArrayList<>();
        for (char c : first.toCharArray()) {
            if (second.contains(String.valueOf(c)) && !result.contains(c)) {
                result.add(c);
            }
        }
        return result;
    }

    private static int getPoints(char c) {
        int points = pointString.indexOf(Character.toUpperCase(c)) + 1;
        if (Character.isUpperCase(c)) {
            points += pointString.length();
        }
        return points;
    }
}